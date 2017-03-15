require 'json'
require 'rest_client'



file_name = $ARGV[0]
@input_data = {}
File.readlines(file_name).each do |line|
  @input_data['parkingLotId'] = line.chomp
  headers = {"Content-Type"=> "application/json"}
  url ='http://0.0.0.0:8080/car_number'
  response = RestClient.post(url,@input_data.to_json,headers)
  p "#{response}"
end
