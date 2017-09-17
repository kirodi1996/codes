class bicycle{
	public int speed;
	public int gear;
	public bicycle(int speed,int gear){
		this.speed=speed;
		this.gear=gear;
	}
	public void	applyBrake(int decrement	){
		speed-=decrement;
	}

}
class mountain extends bicycle{
	public int seatheight;
	public int mountain(int seatheight,int gear){
		this.seatheight=seatheight;
	}
}