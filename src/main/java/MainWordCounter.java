public class MainWordCounter {

    public static void main(String[] args) {

        WordCounter tokenizer = new WordCounter();
        WordCounterSplit split = new WordCounterSplit();
        WordCounterUnbuffered tokenizerUnbuffered = new WordCounterUnbuffered();

        tokenizer.counterTokenizer();
        split.counterSplit();
        tokenizerUnbuffered.counterTokenizerUnbuffered();

    }

}
