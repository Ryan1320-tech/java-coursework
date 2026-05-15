public class Lasagna {
    public static  int expectedMinutesInOven(){
        int y = 40;
        return y;
    }
    public static int remainingMinutesInOven( int x){
        int rt = expectedMinutesInOven();
        return rt - x;
            
    }
    public static int preparationTimeInMinutes(int z){
        return 2*z;
    }
    public static int totalTimeInMinutes(int f,int h){
        int gh =preparationTimeInMinutes(f);
        return gh+h;
        
        
    }
    
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
