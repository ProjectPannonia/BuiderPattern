package com.company;

public class Computer {
    //required parameters
    private String HDD;
    private String RAM;
    //optional parameters
    private boolean isGraphichCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphichCardEnabled = builder.isGraphichCardEnabled;
        this.isBluetoothEnabled = bulder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean isGraphichCardEnabled() {
        return isGraphichCardEnabled;
    }

    public void setGraphichCardEnabled(boolean graphichCardEnabled) {
        isGraphichCardEnabled = graphichCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public static class ComputerBuilder{
        //required parameters
        private String HDD;
        private String RAM;
        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBlueToothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean )
    }
}
