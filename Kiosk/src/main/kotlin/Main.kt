
fun main(args: Array<String>) {
        val controller = Controller()                 // Controller 객체 생성
        controller.setData()                          // Data class 처리할 객체 생성
        controller.promptMain()                       // 화면 출력 객체 생성 -> while 루프로 화면마다 promptMain 안에서 이동
}