public class repeticao {
    
    public static void main(String[] args) {
        
        //caso eu quisesse ir de dois em dois faria assim: i+=2
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++){
                System.out.println(j + "x" + i + "=" + j * i);
                //1x1 = 1
                //2x1 = 2
            }
        }

    }

}
