package creational.builder;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel ultra i9 2026")
                .buildRAM("64gb DDR6 8200MHz")
                .buildSTORAGE("5TB")
                .buildSCREEN("8K 24 inches LG")
                .build();
        System.out.println(computer.toString());
    }
}
