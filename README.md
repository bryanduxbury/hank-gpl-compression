Hank/GPL-Compression
---

This project wraps the compression implementations in gpl-compression (https://github.com/bryanduxbury/gpl-compression) with the CompressionCodec interface from Hank (https://github.com/bryanduxbury/hank), letting you use these compression implementations to compress your Hank domains.

How to do it
=====

1. clone gpl-compression
1. build gpl-compression
1. clone hank-gpl-compression
1. copy gpl-compression-<version>.jar and hank-gpl-compression-<version>.jar to a location that Hank can see it. On a part server, put it in Hank's libdir. In a domain-writing context, it's up to you to figure out where it belongs.
1. Configure your cueball or curly domain by adding:

    compression_codec: com.rapleaf.hank-gpl-compression.QuickLZ15OptimizedCodec

That's it.