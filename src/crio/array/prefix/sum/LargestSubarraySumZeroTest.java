package crio.array.prefix.sum;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubarraySumZeroTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

//    private final InputStream input = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
    }

    @Test
    void largestSubarraySumZero() {

        ByteArrayInputStream in = new ByteArrayInputStream("470 8 20 -11 -4 -10 -7 13 2 17 -19 -4 0 4 15 10 10 1 2 3 -10 -18 -2 0 -12 17 6 -2 -1 5 -3 -9 16 2 7 -16 -18 0 2 -17 -2 4 -20 -19 -13 1 -14 15 -3 9 10 -17 10 -4 -10 10 17 19 15 17 -6 0 -5 -12 18 -19 -11 -17 4 -1 15 -9 6 -16 6 2 -15 15 -20 -11 6 -12 -7 11 -5 13 16 -16 -11 -15 19 -3 -16 -3 16 -19 -16 14 -5 -8 -18 12 7 10 -11 -18 -18 14 -10 -14 -15 -5 18 -1 -15 -12 15 3 -5 -5 -12 -6 20 -13 -5 18 9 -6 -19 13 14 2 -19 12 -6 16 13 12 7 -15 -5 10 8 16 10 -11 -17 -19 -17 -18 -14 5 -6 -15 0 18 4 -15 -1 -13 -15 -10 17 -20 3 8 -5 -4 12 19 9 -12 -11 3 18 -15 15 -1 20 3 -19 6 6 -20 -10 11 -14 -12 -9 -6 -18 -8 17 6 -18 -1 -4 10 9 2 14 9 4 5 15 17 -7 -7 -2 10 -9 4 14 -17 -3 -15 -20 -12 -18 -9 -4 -9 10 0 -5 19 -5 12 0 -10 15 -2 -3 16 -1 12 13 -1 -19 5 16 17 -17 -14 -20 -19 15 -2 -4 0 5 6 18 -5 -15 10 6 -15 1 -9 16 -11 -15 15 -4 -3 8 -19 -11 -11 -8 -5 -2 12 -3 -12 7 -17 10 8 17 3 -18 3 -17 -6 11 0 -18 -16 -7 -15 5 -9 11 3 0 -1 16 13 -20 -10 -12 -8 -18 4 3 -13 14 1 -5 7 -3 -9 1 8 -13 9 13 5 -6 9 -11 -8 -8 -9 17 3 19 -11 -10 6 -9 -5 11 4 19 -20 4 -19 1 0 -15 -9 7 1 -17 14 1 -17 -20 -19 -5 7 3 -16 -14 12 -3 14 -19 11 7 11 1 20 -18 3 13 -9 -6 -10 -3 5 0 -13 13 -8 11 -10 20 -13 -14 4 9 15 7 -11 -3 -6 -4 -13 -9 4 16 -5 -20 15 8 7 -13 17 9 14 -12 -4 15 -10 -18 -16 16 -17 3 20 -11 7 5 4 18 -19 12 -15 -1 -6 15 18 20 5 12 -17 -13 -19 10 12 -5 -19 9 -3 10 -13 -15 -1 -3 6 -12 -2 -14 -6 -17 -20 16 -3 -14 1 1 5 16 -2 2 -10 11 -8 -16 -13 -7 -1 15 -7 -19 12 -3".getBytes());
        LargestSubarraySumZero.main(new String[]{"a"});
        System.setIn(in);
        assertEquals("17 -20 3 8 -5 -4 12 19 9 -12 -11 3 18 -15 15 -1 20 3 -19 6 6 -20 -10 11 -14 -12 -9 -6 -18 -8 17 6 -18 -1 -4 10 9 2 14 9 4 5 15 17 -7 -7 -2 10 -9 4 14 -17 -3 -15 -20 -12 -18 -9 -4 -9 10 0 -5 19 -5 12 0 -10 15 -2 -3 16 -1 12 13 -1 -19 5 16 17 -17 -14 -20 -19 15 -2 -4 0 5 6 18 -5 -15 10 6 ", outContent.toString());
    }
}