class Pemain(var namaPemain:String) {
    lateinit var nilai:String

    fun input() {
        do {
            print("Masukan Pilihan $namaPemain: ")
            nilai = readLine().toString().uppercase()

            //Cek Kebenaran input user atau pemain
            //pemain hanya dapat menginput: Gunting, Batu atau Kertas
            //bila salah menginput, pemain harus mengulang inputan


            val valid = validator(nilai)
        } while (!valid)
    }

}