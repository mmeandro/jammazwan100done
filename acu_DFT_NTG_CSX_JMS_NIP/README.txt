Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - unmarshal object(s) into CSV format
    - FTP into named folder
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - add a script, or manually if only option, deploying to a Karaf
    - write your routes in xml, unless you already did in your first pass



