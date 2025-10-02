fun main() {
    val arrayByte : ByteArray = byteArrayOf(-128,-127,126)
    val arrayShort : ShortArray = shortArrayOf(23,27,126)
    val arrayInt : IntArray = intArrayOf(1,2,3)
    val arrayLong : LongArray = longArrayOf(1L,2L,3L)
    val arrayFloat : FloatArray = floatArrayOf(1.3f, 1.2f)
    val arrayDouble : DoubleArray = doubleArrayOf(2.4,2.5,4.6)
    val arrayChar : CharArray = charArrayOf('a','v')
    val arrayBoolean : BooleanArray = booleanArrayOf(true,false)

    arrayChar.forEach{
        print(it)
    }
}