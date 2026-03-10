package creational.builder;

public class Computer {
    private String cpu, ram, storage,screen;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder{
        private String cpu, ram, storage,screen;
        Builder buildCPU(String cpu){
            this.cpu = cpu;
            return this;
        }

        Builder buildRAM(String ram){
            this.ram = ram;
            return this;
        }

        Builder buildSTORAGE(String storage){
            this.storage = storage;
            return this;
        }

        Builder buildSCREEN(String screen){
            this.screen = screen;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
