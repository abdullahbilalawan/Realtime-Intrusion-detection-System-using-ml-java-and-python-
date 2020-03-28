package org.example;

import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.util.NifSelector;

import java.io.IOException;

public class Get_Network_interface {




    static PcapNetworkInterface  getNetworkDevice() throws IOException {



            PcapNetworkInterface device = new NifSelector().selectNetworkInterface();
            final PcapNetworkInterface a = device;
            return device;









    }




















}
