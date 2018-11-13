public class Printer {

    private int tonerVolume;
    private int loadedPaper;

    public Printer(int loadedPaper, int tonerVolume){
        this.loadedPaper = loadedPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getLoadedPaper(){
        return this.loadedPaper;
    }

    public String print(int pages, int copies) {
        int usedPages = pages * copies;
        if(this.loadedPaper >= usedPages && this.tonerVolume >= usedPages){
            this.loadedPaper -= usedPages;
            this.tonerVolume -= usedPages;
            return "Successfully printed";
        } else {
            return " Not enough paper to print";
        }

    }

    public void refill(int loadedPaper) {
        this.loadedPaper += loadedPaper;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
