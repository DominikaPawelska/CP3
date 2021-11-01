
public class temperatures
{
    float Kelvin;
    float Celcius;
    float Fahrenheit;
    
    temperatures(float Kelvin, float Celcius, float Farenheit){
          this.Kelvin=Kelvin;
          this.Celcius=Celcius;
          this.Fahrenheit=Farenheit;
        }
          
    
    
      public void CelciusToKelvin(){
          Kelvin=Celcius + 273.15f;
          System.out.println(Kelvin);
          
      }
          
      }

