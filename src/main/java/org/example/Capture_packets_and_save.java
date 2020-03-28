package org.example;

import org.pcap4j.core.*;
import org.pcap4j.packet.Packet;

import java.io.File;

public class Capture_packets_and_save {


    static void Capture_and_save(PcapNetworkInterface device) throws PcapNativeException, NotOpenException {


        System.out.println(device);


        // New code below here
        if (device == null) {
            System.out.println("No device chosen.");
            System.exit(1);
        }

        // Open the device and get a handle
        int snapshotLength = 65536; // in bytes
        int readTimeout = 50; // in milliseconds
        final PcapHandle handle;
        handle = device.openLive(snapshotLength, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, readTimeout);

        final PcapDumper dumper = handle.dumpOpen("Pcaps_Legitimate\\dump.pcap");

        // Create a listener that defines what to do with the received packets
        PacketListener listener = new PacketListener() {

            @Override
            public void gotPacket(Packet packet) {
                // Override the default gotPacket() function and process packet
                System.out.println(handle.getTimestamp());
                System.out.println(packet);


                try {
                    dumper.dump(packet, handle.getTimestamp());
                } catch (NotOpenException e) {
                    e.printStackTrace();
                }
            }
        };

        // Tell the handle to loop using the listener we created
        try {
            int maxPackets = 500;
            handle.loop(maxPackets, listener);
        } catch (InterruptedException | NotOpenException e) {
            e.printStackTrace();
        }

        // Cleanup when complete
        handle.close();
        dumper.close();


    }

}
