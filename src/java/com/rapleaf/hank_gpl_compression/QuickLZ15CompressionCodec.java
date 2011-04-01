package com.rapleaf.hank_gpl_compression;

import com.quicklz.QuickLZ15Optimized;
import com.rapleaf.hank.compress.CompressionCodec;

public class QuickLZ15CompressionCodec implements CompressionCodec {

  @Override
  public int compress(byte[] src, int srcOffset, int srcLength, byte[] dst, int dstOff) {
    return QuickLZ15Optimized.compress(src, dst, 1);
  }

  @Override
  public int decompress(byte[] src, int srcOffset, int srcLength, byte[] dst, int dstOff) {
    return QuickLZ15Optimized.decompress(src, dst, srcOffset, dstOff);
  }

  @Override
  public int getMaxCompressBufferSize(int length) {
    return length + 400;
  }

}
