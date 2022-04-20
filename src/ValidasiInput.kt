    fun validator(nilaiPemain:String):Boolean {
        return if (nilaiPemain != "GUNTING" && nilaiPemain != "BATU" &&
            nilaiPemain != "KERTAS"){
            println("")
            println("KETERANGAN:")
            println("ERRORR!! PEMAIN HANYA BOLEH MENGINPUT BATU, GUNTING, KERTAS")
            println("Silahkan Input Kembali!!")
            println("")
            false
        } else {
            true
        }

    }