public class Chip {

    boolean isRed;

    String[] iomha = new String[6];

    Chip(boolean isRed)
    {
        this.isRed = isRed;

        if (isRed){
            iomha[0] = "\u001B[31m   _c'000'c_   ";
            iomha[1] = "\u001B[31m /00000000000\\ ";
            iomha[2] = "\u001B[31m|0000000000000|";
            iomha[3] = "\u001B[31m|0000000000000|";
            iomha[4] = "\u001B[31m \\00000000000/ ";
            iomha[5] = "\u001B[31m  '*=Y000P=*'  ";
        }
        else
        {
            iomha[0] = "\u001B[33m   _c'000'c_   ";
            iomha[1] = "\u001B[33m /00000000000\\ ";
            iomha[2] = "\u001B[33m|0000000000000|";
            iomha[3] = "\u001B[33m|0000000000000|";
            iomha[4] = "\u001B[33m \\00000000000/ ";
            iomha[5] = "\u001B[33m  '*=Y000P=*'  ";
        }
    }

    public boolean getRed()
    {
        if (isRed)
            return true;
        else
            return false;
    }

    public String[] getChip()
    {
        return iomha;
    }

    public void printChip()
    {
        for (String row : iomha)
        {
            System.out.println(row);
        }
    }
}
