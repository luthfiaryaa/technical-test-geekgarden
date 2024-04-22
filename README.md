# Technical Test

## How to Use the Application

1. **Clone this repository**  
    ```bash
    git clone https://github.com/luthfiaryaa/technical-test-geekgarden.git

2. **Navigate to the project directory**  
    ```bash
   cd technical-test-geekgarden

3. **Run this app**
    ```bash
   @SpringBootApplication
   public class TechnicalTestGeekgardenApplication {

   public static void main(String[] args) {
   SpringApplication.run(TechnicalTestGeekgardenApplication.class, args);
   }

}


## API Endpoints

### 1. Fibonacci

- **Endpoint**: `POST http://localhost:8200/api/fibonacci`
- **Request Body**:
  ```json
  {
      "n": 5
  }
  ```
  **Response**:
  ```json
  {
      "output": 5
  }

### 2. Palindrome

- **Endpoint**: `POST http://localhost:8200/api/palindrome`
- **Request Body**:
  ```json
  {
      "input": "racecar"
  } 
  ```
   **Response**:
  ```json
  {
      "output": "raceca"
  }

Thank you for using this application!