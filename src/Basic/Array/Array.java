package Basic.Array;

class Main {

    public static void main(String[] args) {
        // data type, array name = new data type[array size
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // set up an array object with size
        Closet[] closets = new Closet[3];

        // create objects
        Closet item1 = new Closet("socks");
        Closet item2 = new Closet("coat");
        Closet item3 = new Closet("T-shirt" );

        closets[0] = item1;
        closets[1] = item2;
        closets[2] = item3;

        System.out.println(closets[0].name);

        // or create separate object fist and add each to the array object.
        Closet item4 = new Closet("underware");
        Closet item5 = new Closet("jumper");
        Closet item6 = new Closet("jacket" );

        Closet[] newCloset = {item4, item5, item6};

        System.out.println(newCloset[0].name);
    }
}

class Closet {
    String name;

    public Closet(String name) {
        this.name = name;
    }
}