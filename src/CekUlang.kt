 //Validasi ulang pada saat game berakhir
 //Apabila pemain ingin bermain lagi, harus menginput YA / GA

    fun ulang(): Boolean {
        lateinit var ulang: String
        var hasil = true
        do{
            print("COBA LAGI GAK NIH? (YA/GA)?")
            ulang = readLine().toString().uppercase()
            when(ulang) {
                "YA" -> hasil = true
                "GA" -> hasil = false
                else -> println("ERROR REQUEST!! KETIK YA / GA , DONG")
            }
        //Akan berulang jika user tidak menginput perintah YA atau GA

        } while(ulang!="YA" && ulang!="GA")
        return hasil
    }