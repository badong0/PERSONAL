public class App {
    
    public static void main(String[] args){
        
        // char[] name = {'B','A','D','O','N','G'};

        // for (int i = 0; i < name.length; i++){

        //     if (!(name[i] == 'A' || name[i] == 'E' || name[i] == 'I' || name[i] == 'O' || name[i] == 'U')){
        //         System.out.println(name[i]);
        //     }
        // }
        // //     for (int i = 5; i >= 0; i--){
        //         System.out.println(name[i]);
        //     for (int i = name.length - 1; i >= 0; i--){
        //         System.out.println(name[i]);
        //     }        // }
        // }
            char[][] movieReservation = {
                { 'A', 'B', 'C'},
                { 'D', 'E', 'F'},
                { 'G', 'H', 'I'},
        };
        // Access element that is selected
        // System.out.println(movieReservation[0][1]);
        // System.out.println(movieReservation[1][1]);
        // System.out.println(movieReservation[2][0]);
        // for (char a = 0; a < movieReservation.length; a++){   
        //     for (char b = 0; b < 3; b++){
                
        //         System.out.println(movieReservation[a][b]);

        for (int a = 0; a < movieReservation.length; a++){  
            for (int b = 0; b < movieReservation.length; b++){
                int c = a + b;
                if(c % 2 == 0){
                    System.out.println(movieReservation[a][b] + "  ");
                }else{
                    System.out.println("  "+"  ");
                }
            }
        }   
    }
     
}
// for (int a = 0; a < movieReservation.length; a++){   
//             for (int b = 0; b < movieReservation.length; b++){

// }
// System.out.println();       
