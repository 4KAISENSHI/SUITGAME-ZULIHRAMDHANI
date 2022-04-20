   //Validasi apabila pemain tidak menginput batu, gunting, atau kertas

    fun validator(nilaiPemain:String):Boolean {
        return if (nilaiPemain != "GUNTING" && nilaiPemain != "BATU" &&
            nilaiPemain != "KERTAS"){
            println("")

            //Pemain akan diminta untuk menginput pilihan dengan benar
            println("KETERANGAN:")
            println("ERRORR!! PEMAIN HANYA BOLEH MENGINPUT BATU, GUNTING, KERTAS")
            println("Silahkan Input Kembali!!")
            println("")
            false
        } else {
            true
        }

    }