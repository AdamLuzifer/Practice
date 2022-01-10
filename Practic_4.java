public class Practic_4 {
    public static void main(String[] args) {
        Vector xyz = new Vector(12,5,6);
        System.out.println(xyz.length());
    }

    static class Vector{
        private double x;
        private double y;
        private double z;

        public Vector(double x,double y,double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public double length() {
            return Math.sqrt(x * x + y * y + z * z);
        }
    }
}
