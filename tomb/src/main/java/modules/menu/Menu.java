package modules.menu;
import java.util.List;

public abstract class Menu {
    protected List<String> entries;
    private int currentEntry = 0;

    public void nextEntry(){
        currentEntry++;
        if(currentEntry >= this.entries.size())
            currentEntry = 0;
    }

    public void previousEntry(){
        currentEntry--;
        if(currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public boolean isSelected(int i ){
        return currentEntry == i;
    }

    public boolean thirdEntry(){
        return currentEntry == 2;
    }

    public boolean secondEntry(){
        return currentEntry == 1;
    }

    public List<String> getEntries(){
        return entries;
    }
    public int getCurrentEntry(){return currentEntry;}


}
