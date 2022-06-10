public class Polynomial {

    private int Coeff1;
    private int Coeff2;
    private int Coeff3;
    private int Coeff4;
    private double deltaX;
    private double y;
    private double integral;
    private int temp;
    private double sum=0;

    //polynomial constructor
    public Polynomial(int a,int b, int c,int d){
      Coeff1=a;
      Coeff2=b;
      Coeff3=c;
      Coeff4=d;
    }

    public void setDeltaX(double inputDeltax){
        deltaX=inputDeltax;
    }
    public double valueAt(double point){
        point=Coeff1*point*point*point+Coeff2*point*point+Coeff3*point+Coeff4;
        return point;
    }
    public double computeIntegral(double min, double max){

        temp= (int) ((max-min)/deltaX); // this variable is for finding number of intervals of the range

        for (int i=0;i<temp;i++){
            sum=valueAt(min+deltaX*i)*deltaX+sum; //sum is sum of rectangles
        }
        integral=sum;
              return integral;
    }

}
