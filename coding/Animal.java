package coding;

class Animal {
    private static String animalType = "Dog";
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void talk() {
        System.out.println();
    }

    static class Leg {
        private String color;

        public String getColor() {
            return color;

        }
    }

    class Main {
        void start() {
        }

        public static void main(String[] args) {
            Animal baag = new Animal("baag");
            System.out.println(baag.getName());

            Animal.Leg leg = new Animal.Leg();
        }
    }
}

