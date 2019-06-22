package com.yibo.web.converter;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.CompositeConverter;
import com.yibo.web.ansi.AnsiColor;
import com.yibo.web.ansi.AnsiElement;
import com.yibo.web.ansi.AnsiOutput;
import com.yibo.web.ansi.AnsiStyle;

import java.util.Map;

public class ColorConverter extends CompositeConverter<ILoggingEvent> {
    private static final Map<String, AnsiElement> ELEMENTS;

    static {
        ELEMENTS = Map.of("faint", AnsiStyle.FAINT, "red", AnsiColor.RED, "green", AnsiColor.GREEN, "yellow", AnsiColor.YELLOW, "blue", AnsiColor.BLUE, "magenta", AnsiColor.MAGENTA, "cyan", AnsiColor.CYAN);
    }

    private static final Map<Integer, AnsiElement> LEVELS;

    static {
        LEVELS = Map.of(Level.ERROR_INTEGER, AnsiColor.RED, Level.WARN_INTEGER, AnsiColor.YELLOW);
    }

    @Override
    protected String transform(ILoggingEvent event, String in) {
        AnsiElement element = ELEMENTS.get(getFirstOption());
        if (element == null) {
            // Assume highlighting
            element = LEVELS.get(event.getLevel().toInteger());
            element = (element != null ? element : AnsiColor.GREEN);
        }
        return toAnsiString(in, element);
    }

    private String toAnsiString(String in, AnsiElement element) {
        return AnsiOutput.toString(element, in);
    }
}