package pl.esmanowiczpawel;

public class Stack {

    double[] tab;
    int peak;
    double min;

    public Stack(int Max) {
        tab = new double[Max];
        peak = 0;
    }
    public int size(){
        return peak;
    }
    public void clear() throws ArrayIndexOutOfBoundsException{
        if (peak <= 0) {
            throw new IndexOutOfBoundsException("Error, stack is empty");
        }
        for (int i = 0; i < peak; i++){
            tab[i] = 0;
        }
            peak = 0;
    }
    public void reverse(){
        for (int i = 0; i < peak / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[peak - 1 - i];
            tab[peak - 1 -i] = temp;
        }
    }
    public void push(double el) throws ArrayIndexOutOfBoundsException{
        if (peak < tab.length) {
            tab[peak] = el;
            peak++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Error, the stack is full");
        }
    }
    public double pop() throws IndexOutOfBoundsException{
        if (peak <= 0) {
            throw new IndexOutOfBoundsException("Error, stack is empty");
        }
        double temp = tab[peak -1];
        peak--;
        return temp;
    }
    public void printElement() throws IndexOutOfBoundsException{
        if (peak == 0)
            throw new IndexOutOfBoundsException("Error, stack is empty");
        int temp = peak - 1;
        do{
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);
    }

    public double PeekMin() throws IndexOutOfBoundsException{
        if (peak == 0){
            throw new IndexOutOfBoundsException("Error, stack is empty");
        }
        if (min > size()) {
            min = tab[0];
        }
        return tab[0];
    }
}
