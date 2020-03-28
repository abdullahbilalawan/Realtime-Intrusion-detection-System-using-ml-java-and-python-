package org.example;

import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;

import java.io.IOException;

public class Reading_pcap_file {

    static PcapNetworkInterface a;

    static {
        try {
            a = Get_Network_interface.getNetworkDevice();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Reading_pcap_file() throws IOException {
    }


    static void read_file(String file_name) throws PcapNativeException {

    PcapHandle handler = Pcaps.openOffline(file_name);


    }}

