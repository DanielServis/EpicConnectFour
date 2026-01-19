public class Chip {

    boolean isRed;

    String[] iomha = new String[5];

    Chip(boolean isRed)
    {
        this.isRed = isRed;

        if (isRed){
            iomha[0] = "   _c'000'c_   ";
            iomha[1] = " /00000000000\\ ";
            iomha[2] = "|0000000000000|";
            iomha[3] = "|0000000000000|";
            iomha[4] = " \\0000000000/  ";
            iomha[5] = "  '*=Y000P=*'  ";
        }
        else
        {
            iomha[0] = "";
            iomha[1] = "";
            iomha[2] = "";
            iomha[3] = "";
            iomha[4] = "";
        }
    }

    public boolean getRed()
    {
        if (isRed)
            return true;
        else
            return false;
    }

    public String[] printChip()
    {
        return iomha;
    }
}
