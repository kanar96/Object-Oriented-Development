class MobileStatePattern  
{ 
    public static void main(String[] args)  
    { 
        AlertStateDevice stateDevice = new AlertStateDevice(); 
        
        stateDevice.alert(); 
        stateDevice.setState(new Sound()); 
        stateDevice.alert(); 
             
    } 
} 