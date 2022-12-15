package Java_PracticalTasks.PT6.FP;

public class Laptop {

    // поля
    private String laptopmodel; // модель ноутбука
    private int displaysize; // размер дисплея
    private int ramsize; // объем оперативной памяти
    private int hdcapacity; // объем жесткого диска
    private String operatingsystem; // операционная система
    private double laptopweight; // вес ноутбука
    private int batterylife; // время автономной работы
    private int laptopprice; // цена ноутбука
    
    public Laptop(String laptopmodel, int displaysize, int ramsize, int hdcapacity, String operatingsystem,
            double laptopweight, int batterylife, int laptopprice) {
        this.laptopmodel = laptopmodel;
        this.displaysize = displaysize;
        this.ramsize = ramsize;
        this.hdcapacity = hdcapacity;
        this.operatingsystem = operatingsystem;
        this.laptopweight = laptopweight;
        this.batterylife = batterylife;
        this.laptopprice = laptopprice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((laptopmodel == null) ? 0 : laptopmodel.hashCode());
        result = prime * result + displaysize;
        result = prime * result + ramsize;
        result = prime * result + hdcapacity;
        result = prime * result + ((operatingsystem == null) ? 0 : operatingsystem.hashCode());
        long temp;
        temp = Double.doubleToLongBits(laptopweight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + batterylife;
        result = prime * result + laptopprice;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (laptopmodel == null) {
            if (other.laptopmodel != null)
                return false;
        } else if (!laptopmodel.equals(other.laptopmodel))
            return false;
        if (displaysize != other.displaysize)
            return false;
        if (ramsize != other.ramsize)
            return false;
        if (hdcapacity != other.hdcapacity)
            return false;
        if (operatingsystem == null) {
            if (other.operatingsystem != null)
                return false;
        } else if (!operatingsystem.equals(other.operatingsystem))
            return false;
        if (Double.doubleToLongBits(laptopweight) != Double.doubleToLongBits(other.laptopweight))
            return false;
        if (batterylife != other.batterylife)
            return false;
        if (laptopprice != other.laptopprice)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[модель: %s, дисплей: %d дюймов, объем ОЗУ: %d Гб, объем ЖД: %d Гб, ОС: %s, вес: %.1f кг, автономная работа: до %d часов, цена: %d руб.]\n", 
        laptopmodel, displaysize, ramsize, hdcapacity, operatingsystem, laptopweight, batterylife, laptopprice);
    }

    public String getLaptopmodel() {
        return laptopmodel;
    }
    public void setLaptopmodel(String laptopmodel) {
        this.laptopmodel = laptopmodel;
    }
    public int getDisplaysize() {
        return displaysize;
    }
    public void setDisplaysize(int displaysize) {
        this.displaysize = displaysize;
    }
    public int getRamsize() {
        return ramsize;
    }
    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }
    public int getHdcapacity() {
        return hdcapacity;
    }
    public void setHdcapacity(int hdcapacity) {
        this.hdcapacity = hdcapacity;
    }
    public String getOperatingsystem() {
        return operatingsystem;
    }
    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }
    public double getLaptopweight() {
        return laptopweight;
    }
    public void setLaptopweight(double laptopweight) {
        this.laptopweight = laptopweight;
    }
    public int getBatterylife() {
        return batterylife;
    }
    public void setBatterylife(int batterylife) {
        this.batterylife = batterylife;
    }
    public int getLaptopprice() {
        return laptopprice;
    }
    public void setLaptopprice(int laptopprice) {
        this.laptopprice = laptopprice;
    }
    
}
