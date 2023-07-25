public class Driver {
    public static void main(String[] args) {
        Snapshot snapshot = new Snapshot();

        Editor editor = new Editor("temp.text");
        System.out.println("----"+editor.getFilename()+"----\n");

        editor.write("1. line one\n");
        savePrint(editor, snapshot);

        editor.write("2. line two\n");
        savePrint(editor, snapshot);

        editor.write("3. line three\n");
        savePrint(editor, snapshot);

        editor.write("4. line four\n");
        savePrint(editor, snapshot);

        editor.write("5. line five\n");
        print(editor);

        snapshot.restore(editor);
        snapshot.restore(editor);

        editor.write("4. new line four\n");
        savePrint(editor, snapshot);

        editor.write("5. line five\n");
        editor.write("6. line five\n");
        editor.write("7. line five\n");
        savePrint(editor, snapshot);

        snapshot.restore(editor);
        snapshot.restore(editor);
        snapshot.restore(editor);

        print(editor);
    }

    private static void savePrint(final Editor editor, final Snapshot snapshot) {
        snapshot.save(editor);
        print(editor);
    }

    private static void print(final Editor editor) {
        System.out.println(editor);
        System.out.println();
    }
}
