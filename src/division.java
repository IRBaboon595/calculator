import java.util.ArrayList;

public class division implements mathOperation
{
    public division(){}
    public division(double first, double second)
    {
        m_firstNum = first;
        m_secondNum = second;
    }

    @Override
    public double run(){
        double result = m_firstNum / m_secondNum;
        return result;
    }

    @Override
    public void getArgs(ArrayList<Double> al)
    {
        m_firstNum = al.get(0);
        m_secondNum = al.get(1);
    }

    double m_firstNum = 0;
    double m_secondNum = 0;
}
