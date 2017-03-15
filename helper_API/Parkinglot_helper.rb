require 'json'
require 'csv'
#require 'active_support'
#require 'active_support/core_ext'
require 'rest_client'



file_name = $ARGV[0]
@input_data = {}
File.readlines(file_name).each do |line|
  splits = line.split(",")
  number = splits[0].chomp
  color = splits[1].chomp
  @input_data['registrationNumber'] = number
  @input_data['colour'] = color
  headers = {"Content-Type"=> "application/json"}
  url ='http://0.0.0.0:8080/park_car'

  response = RestClient.post(url,@input_data.to_json,headers)
  p "#{response}"
end
