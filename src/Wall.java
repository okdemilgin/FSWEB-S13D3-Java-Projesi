public class Wall {
    double width;
    double height;

    public Wall(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }
    public void setHeight (double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getArea (){
        return width*height;
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("---person---");
            Person person = new Person("John", "Doe", 20);

            System.out.println("Firstname: " + person.getFirstName());

            System.out.println("LastName: " + person.getLastName());

            System.out.println("Age: " + person.getAge());
            System.out.println("---person---");

            System.out.println("---wall---");

            Wall wall = new Wall(4,5);

            System.out.println("area= " + wall.getArea());

            wall.setHeight(-1.5);

            System.out.println("width= " + wall.getWidth());

            System.out.println("height= " + wall.getHeight());

            System.out.println("area= " + wall.getArea());

            System.out.println("---wall---");
        }
    }
}
