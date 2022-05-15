package com.br.adrianogomes;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void truncateMessage1() throws Exception {
        String result = Solution.solution("Codility We test coders", 14);
        Assert.assertEquals("Codility We", result);
    }

    @Test
    public void truncateMessage2() throws Exception {
        String result = Solution.solution("Why not", 100);
        Assert.assertEquals("Why not", result);
    }

    @Test
    public void truncateMessage3() throws Exception {
        String result = Solution.solution("The quick brown fox jumps over the lazy dog", 39);
        Assert.assertEquals("The quick brown fox jumps over the lazy", result);
    }

    @Test
    public void truncateMessage4() throws Exception {
        String result = Solution.solution("To crop or not to crop", 21);
        Assert.assertEquals("To crop or not to", result);
    }
}
