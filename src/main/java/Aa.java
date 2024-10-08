
	public boolean illegal(int maxSpeed) {
		if (this.getSpeed() > maxSpeed)
			return true;
		else if (this.getPrivateCar() == true)
			return true;
		return false;
	}
	
	public boolean allGood() {
		for (int i=0; i < this.cars.length; i++) {
			if (this.cars[i].illegal(this.getMaxSpeed()) == true)
				return false;
		}
		return true;
	}
	
	public static int legalCities(cameraInfo[] cameras) {
		boolean[] cities = new boolean[100];
		for (int i=0; i < cameras.length; i++) {
			int city = cameras[i].getCity();
			if (cameras[i].allGood() == true && cities[city] == false)
				cities[city] = false;
			else
				cities[city] = cameras[i].allGood();
		}
		int count = 0;
		for (int i = 0; i < cities.length; i++) {
			if (cities[i] == true)
				count++;
		}
		
		return count;
	}

