import subprocess

# Execute the Java program with command-line arguments
result = subprocess.run(["java", "TestMain.java", "arg0"], capture_output=True, text=True)

# Print the output of the Java program
print(result.stdout)
