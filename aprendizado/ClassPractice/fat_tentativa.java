public class fat_tentativa {
    static int fat(int num){
        if(num == 1 || num == 0) return 1;
        else return num*fat(num-1);
    }

    public static void main(String[] args) {
        
        System.out.println(fat(2));
    }
}
