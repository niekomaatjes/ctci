package GoogleTechDev.decompresscompressed;


import GoogleTechDev.decompresscompressed.DecompressString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DecompressStringTest {

    @Test(timeout = 150)
    public void decompress() {
        DecompressString decompressString = new DecompressString();
        Assert.assertEquals("abcabcabcababababc", decompressString.decompress("3[abc]4[ab]c"));
        Assert.assertEquals("aaaaaaaaaa", decompressString.decompress("10[a]"));
        Assert.assertEquals("aaabaaab", decompressString.decompress("2[3[a]b]"));
        Assert.assertNotEquals("", decompressString.decompress("2[3[a]b]"));
        Assert.assertEquals("bcd", decompressString.decompress("1[b]1[c]1[d]"));
        Assert.assertEquals("qqqwertttyy", decompressString.decompress("1[1[1[q]q]q]1[wer]3[t]1[2[y]]"));
        Assert.assertEquals("xx", decompressString.decompress("1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[1[xx]]]]]]]]]]]]]]]]]]]]"));
    }
}