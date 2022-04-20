fun main(){
    val pemain1 = Pemain<Any>("Pemain 1")
    val pemain2 = Pemain<Any>("Pemain 2")

    do {

        println("=================================")
        println("GAME SUIT TERMINAL VERSION KOTLIN")
        println("=================================")

        //INPUTAN PEMAIN

        //inputan pemain 1
        pemain1.input()

        //inputan pemain 2
        pemain2.input()

        //mengecek siapa yang menang dengan fungsi yang ada di class CekHasil
        val cekHasil=CekHasil(pemain1.namaPemain,pemain1.nilai,pemain2.namaPemain,pemain2.nilai)
        cekHasil.cek()

    } while(ulang())

}