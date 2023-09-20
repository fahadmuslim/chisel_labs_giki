import chisel3._
import chisel3.util._

class SevenSegDemo extends Module {
  val io = IO(new Bundle {
    val number = Input(UInt(10.W))
    val seg = Output(UInt(7.W))
    val an =  Output(UInt(8.W))
    val dp = Output(UInt(1.W))
  })

  val sevSeg = WireDefault("b1111111".U(7.W))

  val temp = io.number

  switch(temp) {

  is ("b0000000001".U) {sevSeg := "b0000001".U } // Display 0
  is ("b0000000010".U) {sevSeg := "b1001111".U } // Display 1
  is ("b0000000100".U) {sevSeg := "b0010010".U } // Display 2
  is ("b0000001000".U) {sevSeg := "b0000110".U } // Display 3
  is ("b0000010000".U) {sevSeg := "b1001100".U } // Display 4
  is ("b0000100000".U) {sevSeg := "b0100100".U } // Display 5
  is ("b0001000000".U) {sevSeg := "b0100000".U } // Display 6
  is ("b0010000000".U) {sevSeg := "b0001111".U } // Display 7
  is ("b0100000000".U) {sevSeg := "b0000000".U } // Display 8
  is ("b1000000000".U) {sevSeg := "b0000100".U } // Display 9

  } 

  io.seg := sevSeg
  io.an := "b11111110".U
  io.dp := "b0".U
}

// generate Verilog
object SevenSegDemo extends App {
  emitVerilog(new SevenSegDemo())
}