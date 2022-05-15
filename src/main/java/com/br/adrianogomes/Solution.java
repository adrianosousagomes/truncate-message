package com.br.adrianogomes;

import static java.util.Objects.nonNull;

public class Solution {
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    private static final String TWO_SPACES = " ";
    private static final String ERROR_MESSAGE = "Error while try to truncate message: %s";
    private static final String INVALID_MESSAGE_PARAMETER = "Message can not be null.";
    private static final String INVALID_RANGE_PARAMETER = "Invalid range, try something range between 1 e 500.";

    public static String solution(String message, int K) throws Exception {
        try {
            validate(message, K);

            if (nonNull(message) && message.length() > K) {
                return truncateMessageIfNecessary(message, K);
            }
        } catch(Exception e) {
            System.err.println(String.format(ERROR_MESSAGE, e.getMessage()));
        }

        return message;
    }

    private static void validate(final String message, final int K) throws Exception {
        if (message == null) {
            throw new Exception(INVALID_MESSAGE_PARAMETER);
        }

        if(K < 1 && K > 500) {
            throw new ArithmeticException(INVALID_RANGE_PARAMETER);
        }
    }

    private static String cleanMessage(final String message) {
        return message.trim().replaceAll(TWO_SPACES, SPACE);
    }

    private static String truncateMessageIfNecessary(final String message, final int K) {
        String cleanedMessage = cleanMessage(message);
        String newMessage = EMPTY;
        String[] words = cleanedMessage.split(SPACE);

        for (int i = 0; i < words.length; i++) {
            if ((newMessage.length() + words[i].length()) <= K) {
                newMessage = newMessage + words[i] + SPACE;
            }
        }

        return newMessage.trim();
    }
}
