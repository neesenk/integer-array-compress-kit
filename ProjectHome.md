The project has compression algorizm implementation of Integer arrays compression such as

  1. PForDelta (PFD)
  1. Variable Byte
  1. Simple9
  1. NewPForDelta (NewPFD)
  1. Variant Code

  * It already is confirmed that the decompress speed of this PFD, NewPFD is over　500 (M int / sec)  for intger-array gaplist datasets including many tiny value.

  * The project will be added like Group Variant Code, Delta Code and so on soon.