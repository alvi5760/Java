public class Box {
    int height;
    int width;
    int length;
    public static void calculate_area( int height,int width,int length){

        System.out.println(height*width*length);

    }
    public static void calculate_area( int height,int width){
        System.out.println(height*width);

    }
    public void display(){
        System.out.println(height);
        System.out.println(width);
        System.out.println(length);
    }
    public static void main(String[]args){

        calculate_area(30,20,15);
        calculate_area(30,20);
        Box obj1=new Box();
        obj1.height=30;
        obj1.width=20;
        obj1.length=15;
        obj1.display();
    }

}
