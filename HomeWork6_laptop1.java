public class HomeWork6_laptop1 {
    String name;
    String weight;
    String color;
    String memory;
    Integer price;

    public HomeWork6_laptop1(String nam, String weig, String col, String mem, Integer pric) {
       this.name = nam;
       this.weight = weig;
       this.color = col;
       this.memory = mem;
       this.price = pric;
    }

    public HomeWork6_laptop1() {

    }

    void Print(){
        System.out.println('|' + name + '|' + weight + '|' + color + '|' + memory + '|' + price);
        System.out.println();
    }

    void PrintWeight(){
        System.out.println('|' + name + '|' + weight);
        System.out.println();
    }
    
    void PrintColor(){
        System.out.println('|' + name + '|' + color);
        System.out.println();
    }

    void PrintMemory(){
        System.out.println('|' + name + '|' + memory);
        System.out.println();
    }

    void PrintPrice(){
        System.out.println('|' + name + '|' + price);
        System.out.println();
    }

    void PrintABC(String num){
            if(num.equals(name)){
                System.out.println('|' + name + '|' + weight + '|' + color + '|' + memory + '|' + price);
        }
        
    }

}
