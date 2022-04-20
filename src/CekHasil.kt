class CekHasil(var namaPemain1:String, var nilaiPemain1:String,
               var namaPemain2:String, var nilaiPemain2: String){
    lateinit var hasil: String
    
    //Menampilkan fungsi yang akan jadi pemenang

    fun cek() {
        if (nilaiPemain1 == "BATU" && nilaiPemain2 == "BATU") {
            hasil = "Seri"
        }
        if (nilaiPemain1 == "BATU" && nilaiPemain2 == "KERTAS") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "BATU" && nilaiPemain2 == "GUNTING") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "KERTAS" && nilaiPemain2 == "BATU") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "KERTAS" && nilaiPemain2 == "KERTAS") {
            hasil= "Seri"
        }
        if (nilaiPemain1 == "KERTAS" && nilaiPemain2 == "GUNTING") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "GUNTING" && nilaiPemain2 == "BATU") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "GUNTING" && nilaiPemain2 == "KERTAS") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "GUNTING" && nilaiPemain2 == "GUNTING") {
            hasil= "Seri"
        }
        println("")
        println("Hasil:")
        if(hasil=="Seri"){
            println("DRAW!")
        }else {
            println("$hasil MENANG!")
        }
        println("")
        println("")
    }
}
