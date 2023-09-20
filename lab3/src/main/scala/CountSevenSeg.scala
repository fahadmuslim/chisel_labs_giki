import chisel3._
import chisel3.util._

class CountSevenSeg extends Module {
  val io = IO(new Bundle {
    //val active = Input(UInt(1.W))
    val seg = Output(UInt(7.W))
    val an =  Output(UInt(8.W))
    val dp = Output(UInt(1.W))
  })

  val sevSeg = WireDefault("b0000000".U(7.W))

  // *** HEX counter code starts here



  // *** Counter code ends here

  io.seg := sevSeg
  io.an := "b11111110".U
  io.dp := "b0".U
}

// generate Verilog
object CountSevenSeg extends App {
  emitVerilog(new CountSevenSeg())
}