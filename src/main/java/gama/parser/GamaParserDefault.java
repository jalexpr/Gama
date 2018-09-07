package gama.parser;

import org.tfwwt.parser.string.Parser;

import java.util.List;

public class GamaParserDefault implements IGamaParser {
    @Override
    public void init() {
    }

    @Override
    public List<String> getParserBearingPhrase(String bearingPhrase) {
        return Parser.parserBasicsPhase(bearingPhrase.toLowerCase());
    }

    @Override
    public List<List<String>> getParserSentence(String sentence) {
        return Parser.parserSentence(sentence.toLowerCase());
    }

    @Override
    public List<List<List<String>>> getParserParagraph(String sentence) {
        return Parser.parserParagraph(sentence.toLowerCase());
    }

    @Override
    public List<List<List<List<String>>>> getParserText(String text) {
        return Parser.parserText(text.toLowerCase());
    }
}
