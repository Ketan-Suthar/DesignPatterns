public class Editor {
    private StringBuilder text;

    private String filename;

    public Editor(final String filename){
        this.filename = filename;
        text = new StringBuilder();
    }

    public void write(final String newText) {
        this.text.append(newText);
    }

    public Memento save() {
        return new Memento(filename, text);
    }

    public void restore(final Memento memento) {
        this.filename = memento.filename;
        this.text = memento.text;
    }

    @Override
    public String toString() {
        return text.toString();
    }

    public String getFilename() {
        return filename;
    }

    public class Memento {
        private final String filename;
        private final StringBuilder text;

        public Memento(final String filename, final StringBuilder text) {
            this.filename = filename;
            this.text = new StringBuilder(text);
        }
    }
}
