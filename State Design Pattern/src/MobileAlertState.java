interface MobileAlertState  
{ 
    public void alert(AlertStateDevice device); 
} 
  
class AlertStateDevice  
{ 
    private MobileAlertState mobileState; 
  
    public AlertStateDevice()  
    { 
        mobileState = new Vibration(); 
    } 
  
    public void setState(MobileAlertState state)  
    { 
        mobileState = state; 
    } 
  
    public void alert()  
    { 
        mobileState.alert(this); 
    } 
}
